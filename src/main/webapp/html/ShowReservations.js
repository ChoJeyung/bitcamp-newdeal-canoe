"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

loadList();
var { page, size } = $.parseQuery(location.href);

let cardbody = $('.card');
let data = null;
var url =  `${serverApiAddr}/json/reservation/list`;
console.log(url);
var json = (function () {
	var json = null;
	$.ajax({
		'async': false,
		'global': false,
		'url': url,
		'dataType': "json",
		'success': function (data){
			json = data;
		}
	});
	return json;
})();
function loadList() {
    $.getJSON(`${serverApiAddr}/json/travel/showReservation`, (result) => {
		console.log('예약현황',result);
		var html = '';
		if (result.list.length > 0) {
			for (var i = 0; i < result.list.length; i++) {
				result.list[i].reservationNo = json.list[i].reservationNo;
				result.list[i].memberNo = json.list[i].memberNo;
				result.list[i].travelNo = json.list[i].travelNo;
				result.list[i].seatClass = json.list[i].seatClass;
			}
			html = template(result);
		} else {
			html = '<br><br><br><br><h1 style="text-align:center">예약 정보가 존재하지 않습니다.</h1>';
		}
		data = result;
        $('#content-middle').html(html);
    })
}