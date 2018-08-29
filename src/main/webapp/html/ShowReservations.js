"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

loadList();
var { page, size } = $.parseQuery(location.href);

let cardbody = $('.card');
let data = null;
var url =  `${serverApiAddr}/json/reservation/list/1`;
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
function loadList() {
    $.getJSON(`${serverApiAddr}/json/travel/showReservation/`+1, (result) => {
    	console.log(result)
    	for (var i = 0; i < result.list.length; i++) {
			result.list[i].reservationNo = json.list[i].reservationNo;
			result.list[i].memberNo = json.list[i].memberNo;
			result.list[i].travelNo = json.list[i].travelNo;
			result.list[i].seatClass = json.list[i].seatClass;
		}
        var html = template(result);
        data = result;
        $('#card').html(html);
    })
}