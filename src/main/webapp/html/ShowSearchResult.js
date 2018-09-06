"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

var { sap, aap, sdt, adt } = $.parseQuery(location.href);

loadStartList();

let cardbody = $('.card');
let data = null;


function loadStartList() {
	// 출발 공항 번호/도착 공항 번호/출발 날짜/도착 날짜
    $.getJSON(`${serverApiAddr}/json/travel/ShowSearchResult/${sap}/${aap}/${sdt}`, (result) => {
    	
    	for (var i = 0; i < result.list.length; i++) {
			result.list[i].adt = adt;
		}
    	console.log(result);
        var html = template(result);
        data = result;
        $('#content-middle-start').html('');
        $('#content-middle-start').html(html);
    })
}

// 페이지 이동 함수(후에 한 페이지로 합친 후엔 아래 주석을 참조하여 새 함수 생성 필요)
$('.travel').on('click', function(event){
	var no = $(event.target).attr('data-id');
	console.log($(event.target));
	location.href='ShowPrice.html?travelNo'+no;
});