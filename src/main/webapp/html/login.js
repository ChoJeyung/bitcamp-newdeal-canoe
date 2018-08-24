'use strict'

$('#loginBtn').click(() => {
    
    //console.log($('#fSaveEmail').is(':checked'));
    //console.log($('#fSaveEmail').prop('checked'));
    $.post(
            `${serverApiAddr}/json/auth/signIn`, 
            {
                email: $('#fEmail').val(),
                saveEmail: $('#fSaveEmail').prop('checked'),
                password: $('#fPassword').val()
            }, 
            (result) => {
                if (result.status === 'success') {
                    //메인페이지 중 로그인 버튼 화면을 제거? 덮어씌우기?
                    alert('로그인 성공');
                    //location.href = 'businesscard/index.html?';
                } else {
                    alert('로그인 실패!');
                }
            }, 
            'json')
            .fail((e) => {
                alert('서버 요청 중 오류 발생!');
                console.log(e);
            });
});