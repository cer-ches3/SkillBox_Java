package org.example.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.UserDetailsDto;
import org.example.entities.BankDetails;
import org.example.entities.UserDetails;
import org.example.repositories.BankRepository;
import org.example.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements CRUDService<UserDetailsDto> {
    private final UserRepository userRepository;
    private final BankRepository bankRepository;

    @Override
    public UserDetailsDto getById(int id) {
        log.info("Get by id: " + id);
        UserDetails userDetails = userRepository.findById(id).orElseThrow();
        return mapToDto(userDetails);
    }

    @Override
    public Collection<UserDetailsDto> getAll() {
        log.info("Get all");
        return userRepository.findAll()
                .stream()
                .map(UserService::mapToDto)
                .toList();
    }

    @Override
    public void create(UserDetailsDto dto) {
        UserDetails userDetails = mapToEntity(dto);
        Integer bankId = dto.getBankId();
        BankDetails bankDetails = bankRepository.findById(bankId).orElseThrow();
        userDetails.setBank(bankDetails);
        userDetails.setAge(Period.between(userDetails.getBirthday(), LocalDate.now()).getYears());
        userDetails.setPhone(userDetails.getLogin());
        userDetails.setNumberCard(generateNumberCard());
        userDetails.setSecretCode(generateSecretCode());
        userDetails.setNumberScore(generateNumberScore());
        userDetails.setValidityPeriod(generateValidityPeriod());

        String phone = formatingPhone(userDetails.getLogin());
        String password = userDetails.getPassword();
        if (phoneIsValid(phone) && passwordIsValid(password)) {
            log.info("Create");
            userDetails.setLogin(phone);
            userDetails.setPassword(password);
            userRepository.save(userDetails);
        }
        if (!phoneIsValid(phone)) {
            log.error("Phone is not valid");
        }
        if (!passwordIsValid(password)) {
            log.error("Пароль должен соответствовать следующим правилам:\n" +
                    "1. Длина пароля должна быть не менее 8 символов." + '\n' +
                    "2. Пароль должен содержать хотя бы одну заглавную букву." + '\n' +
                    "3. Пароль должен содержать хотя бы одну строчную букву." + '\n' +
                    "4. Пароль должен содержать хотя бы одну цифру." + '\n' +
                    "5. Пароль должен содержать только латинские символы." + '\n' +
                    "6. Пароль должен содержать хотя бы один специальный символ (например, @, #, $, %, &, и т.д.).)");
        }

    }

    @Override
    public void update(UserDetailsDto dto) {
        log.info("Update");
        UserDetails userDetails = mapToEntity(dto);
        Integer bankId = dto.getBankId();
        BankDetails bankDetails = bankRepository.findById(bankId).orElseThrow();
        userDetails.setBank(bankDetails);
        userRepository.save(userDetails);
    }

    @Override
    public void delete(Integer id) {
        log.info("Delete by id");
        userRepository.deleteById(id);
    }

    public static UserDetailsDto mapToDto(UserDetails userDetails) {
        UserDetailsDto dto = new UserDetailsDto();
        dto.setId(userDetails.getId());
        dto.setLogin(userDetails.getLogin());
        dto.setPassword(userDetails.getPassword());
        dto.setSurname(userDetails.getSurname());
        dto.setFirstname(userDetails.getFirstname());
        dto.setLastname(userDetails.getLastname());
        dto.setBirthday(userDetails.getBirthday());
        dto.setAge(userDetails.getAge());
        dto.setPhone(userDetails.getPhone());
        dto.setEmail(userDetails.getEmail());
        dto.setNumberCard(userDetails.getNumberCard());
        dto.setSecretCode(userDetails.getSecretCode());
        dto.setNumberScore(userDetails.getNumberScore());
        dto.setValidityPeriod(userDetails.getValidityPeriod());
        dto.setBankId(userDetails.getBank().getId());
        return dto;
    }

    public static UserDetails mapToEntity(UserDetailsDto dto) {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(dto.getId());
        userDetails.setLogin(dto.getLogin());
        userDetails.setPassword(dto.getPassword());
        userDetails.setSurname(dto.getSurname());
        userDetails.setFirstname(dto.getFirstname());
        userDetails.setLastname(dto.getLastname());
        userDetails.setBirthday(dto.getBirthday());
        userDetails.setAge(dto.getAge());
        userDetails.setPhone(dto.getPhone());
        userDetails.setEmail(dto.getEmail());
        userDetails.setNumberCard(dto.getNumberCard());
        userDetails.setSecretCode(dto.getSecretCode());
        userDetails.setNumberScore(dto.getNumberScore());
        userDetails.setValidityPeriod(dto.getValidityPeriod());
        return userDetails;
    }

    private static String formatingPhone(String phone) {
        String formatPhone = phone.replaceAll("[^0-9]", "");
        char firstChar = formatPhone.charAt(0);
        if (firstChar == '8' && formatPhone.length() == 11) {
            formatPhone = "7" + formatPhone.substring(formatPhone.length() - 10);
        }
        if (formatPhone.length() == 10 && firstChar == '9') {
            formatPhone = "7" + formatPhone;
        }
        return formatPhone;
    }

    private static boolean phoneIsValid(String phone) {
        String regex = "79[0-9]{9}";
        return phone.matches(regex);
    }

    private static boolean passwordIsValid(String password) {
        boolean passwordIsValid = false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChars = false;
        boolean hasNotCyrillic = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigits = true;
            } else if ("@#$%^&*+=-_/!~|<>?".indexOf(ch) >= 0) {
                hasSpecialChars = true;
            }
        }
        String cyrillicChar = password.replaceAll("[^А-я]", "");
        if (cyrillicChar.length() == 0) {
            hasNotCyrillic = true;
        }

        if (password.length() >= 8 && hasUpperCase && hasLowerCase && hasDigits && hasSpecialChars && hasNotCyrillic) {
            passwordIsValid = true;
        }
        return passwordIsValid;
    }

    private static String generateNumberCard() {
        StringBuilder builder = new StringBuilder();
        String typePaymentSystem = "2";
        String idBank = "022";
        int infoBankGenerate = (int) (Math.random() * 100);
        String infoBank = (infoBankGenerate < 10) ? "0" + infoBankGenerate : String.valueOf(infoBankGenerate);
        int codeProductGenerate = (int) (Math.random() * 100);
        String codeProduct = (codeProductGenerate < 10) ? "0" + codeProductGenerate : String.valueOf(codeProductGenerate);
        int numberCard1Generate = (int) (Math.random() * 10_000);
        String numberCard1 = "";
        if (numberCard1Generate < 1000 && numberCard1Generate >= 100) {
            numberCard1 = "0" + numberCard1Generate;
        } else if (numberCard1Generate < 100 && numberCard1Generate >= 10) {
            numberCard1 = "00" + numberCard1Generate;
        } else if (numberCard1Generate < 10) {
            numberCard1 = "000" + numberCard1Generate;
        } else {
            numberCard1 = String.valueOf(numberCard1Generate);
        }
        int numberCard2Generate = (int) (Math.random() * 1000);
        String numberCard2 = "";
        if (numberCard2Generate < 100 && numberCard2Generate >= 10) {
            numberCard2 = "0" + numberCard2Generate;
        } else if (numberCard2Generate < 10) {
            numberCard2 = "00" + numberCard2Generate;
        } else {
            numberCard2 = String.valueOf(numberCard2Generate);
        }
        String cryptoCode = String.valueOf((int) (Math.random() * 10));
        builder.append(typePaymentSystem)
                .append(idBank)
                .append(" ")
                .append(infoBank)
                .append(codeProduct)
                .append(" ")
                .append(numberCard1)
                .append(" ")
                .append(numberCard2)
                .append(cryptoCode);
        return builder.toString();
    }

    private static String generateSecretCode() {
        int secretCodeGenerate = (int) (Math.random() * 1000);
        String secretCode = String.valueOf(secretCodeGenerate);
        if (secretCodeGenerate < 100 && secretCodeGenerate >= 10) {
            secretCode = "0" + secretCodeGenerate;
        }
        if (secretCodeGenerate < 10) {
            secretCode = "00" + secretCodeGenerate;
        }
        return secretCode;
    }

    private static String generateNumberScore() {
        StringBuilder builder = new StringBuilder();
        String firstOrderBalanceAccount = "408";
        String secondOrderBalanceAccount = "02";
        String currencyCode = "810";
        String controlNumber = "0";
        String idBank = "6485";
        String uID = String.valueOf((int) (Math.random() * 10_000_000));
        builder.append(firstOrderBalanceAccount)
                .append(secondOrderBalanceAccount)
                .append(currencyCode)
                .append(controlNumber)
                .append(idBank)
                .append(uID);
        return builder.toString();
    }

    private static String generateValidityPeriod() {
        StringBuilder builder = new StringBuilder();
        LocalDate validLocalDate = LocalDate.now().plusYears(5);
        int year = validLocalDate.getYear();
        int month = validLocalDate.getMonthValue();
        builder.append(month < 10 ? "0" + month : month)
                .append('/')
                .append(year);
        return builder.toString();
    }
}
