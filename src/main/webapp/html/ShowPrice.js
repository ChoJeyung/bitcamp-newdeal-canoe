"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

loadList();
var { page, size } = $.parseQuery(location.href);

let cardbody = $('.card');
let data = null;
var json;

function loadList() {
	var no = $.parseQuery(location.href);
	console.log(no);
	var url =  `${serverApiAddr}/json/travel/`+no.travelNo;
	console.log(url);
	json = (function () {
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
	url = `${serverApiAddr}/json/grade/`+no.travelNo; 
	console.log(json);
    $.getJSON(url, (result) => {
    	for (var i = 0; i < result.list.length; i++) {
			result.list[i].startName = json.list.startAirportName;
			result.list[i].arriveName = json.list.arriveAirportName;
			result.list[i].arriveTravelTime = json.list.arriveTravelTime;
			result.list[i].startTravelTime = json.list.startTravelTime;
		}
    	data = result;
        var html = template(result);
        $('#content-middle').html(html);
    })
}

function makeReserv(seatClass){
	$.get(
		`${serverApiAddr}/json/auth/sessionCheck`, 
		(result)=>{
			if(result.loginUser == '' || result.loginUser == undefined) {
				swal({
					type: 'warning',
					text: '로그인 후 이용할 수 있습니다.'
				});
				return;
			}
			console.log(data);
			$.getJSON
			(`${serverApiAddr}/json/reservation/MakeReservation/`+"1/"+json.list.travelNo+"/"+seatClass, (result) => {
				location.href="ShowReservations.html";
			})
	});
}