$(function(){

    $.get('/init', {}, function(response){
        if(!response.result)
        {
            let name = prompt('Введите Ваше имя:');
            registerUser(name);
            return;
        }
        initApplication();
    });

    let registerUser = function(name)
        {
            $.post('/auth', {name: name}, function(response){
                if(response.result) {
                    initApplication();
                }
            });
        };

    let initApplication = function(){
            $('.head-chat').css({display: 'flex'});
            $('.message-and-users-list').css({display: 'flex'});
            $('.control').css({display: 'flex'});

            $('.send-message').on('click', function()
                    {
                        let message = $('.new-message').val();
                        $.post('/message', {message: message}, function(response){
                            if(response.result) {
                                $('.new-message').val('');
                            } else {
                                alert('Ошибка :( Повторите попытку позже');
                            }
                        });
                    });
                    setInterval(updateMessages, 1000)
        };

        let updateMessages = function()
            {
                $('.message-list').html();
                $.get('/message', {}, function(response){
                    if(response.length == 0) {
                        return;
                    }
                    $('.message-list').html('');
                    for(i in response)
                    {
                        let element = getMessageElement(response[i]);
                        $('.message-list').append(element);
                    }
                });
            };

        let getMessageElement = function(message)
            {
                let item = $('<div class="message-item"></div>');
                let header = $('<div class="message-header"></div>');
                header.append($('<div class="datetime">' +
                    message.datetime + '</div>'));
                header.append($('<div class="username">' +
                    message.username + '</div>'));
                let textElement = $('<div class="message-text"></div>');
                textElement.text(message.text);
                item.append(header, textElement);
                return item;
            };



});

