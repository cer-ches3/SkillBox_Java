package searchengine.responses;

import lombok.Data;

@Data
public class ErrorResponse extends DefaultResponse{
    private boolean result;
    private String error;

    public ErrorResponse() {
        super(true);
    }

    public static ErrorResponse getErrorResponse(String errorMessage) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setError(errorMessage);
        return errorResponse;
    }
}
