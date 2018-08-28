"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

var reservationNo = $.parseQuery(location.href);
let cardbody = $('.card');
let data = null;
console.log(reservationNo);
var url =  `${serverApiAddr}/json/reservation/get/`+reservationNo.reservationNo;
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
console.log(json);
loadList();
function loadList() {
    $.getJSON(`${serverApiAddr}/json/travel/`+json.result.travelNo, (result) => {
    	result.list.seatClass = json.result.seatClass;
    	console.log(json);
        var html = template(result.list);
        $('#card').html(html);
    })
}

function cancelReserv() {
	$.getJSON
	(`${serverApiAddr}/json/reservation/CancelReservation/`+json.result.reservationNo, (result) => {
		location.href="ShowReservations.html";
    })
}