"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

var { sap, aap, sdt } = $.parseQuery(location.href);
console.log('sap = ', sap);
console.log('aap = ', aap);
console.log('sdt = ', sdt);
loadList();

let cardbody = $('.card');
let data = null;


function loadList() {
	//출발 공항 번호/도착 공항 번호/출발 날짜/도착 날짜
    $.getJSON(`${serverApiAddr}/json/travel/ShowSearchResult/${sap}/${aap}/${sdt}`, (result) => {
        var html = template(result);
        data = result;
        $('#content-middle').html(html);
    })
}

// 페이지 이동 함수(후에 한 페이지로 합친 후엔 아래 주석을 참조하여 새 함수 생성 필요)
$('.travel').on('click', function(event){
	var no = $(event.target).attr('data-id');
	console.log($(event.target));
	location.href='ShowPrice.html?travelNo'+no;
});