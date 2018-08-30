"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

loadList();
var { page, size } = $.parseQuery(location.href);

let cardbody = $('.card');
let data = null;


function loadList() {
	//출발 공항 번호/도착 공항 번호/출발 날짜/도착 날짜
    $.getJSON(`${serverApiAddr}/json/travel/ShowSearchResult/1/15/2018-08-24`, (result) => {
        var html = template(result);
        data = result;
        $('#card').html(html);
    })
}

// 페이지 이동 함수(후에 한 페이지로 합친 후엔 아래 주석을 참조하여 새 함수 생성 필요)
$('.travel').on('click', function(event){
	var no = $(event.target).attr('data-id');
	console.log($(event.target));
	location.href='ShowPrice.html?travelNo'+no;
});