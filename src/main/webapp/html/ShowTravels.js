"use strict"
var liTemplateSrc = $('#li-template').text();
var template = Handlebars.compile(liTemplateSrc);

loadList();
var { page, size } = $.parseQuery(location.href);

let cardbody = $('.card');
let data = null;


function loadList() {
    $.getJSON(`${serverApiAddr}/json/travel/list`, (result) => {
        var APName;
        for (var item of result.list) {

            $.getJSON(`${serverApiAddr}/json/airport/${item.startAirportNo}`, (APName) => {

                item.startAirportNo = APName.airport.airportName;
            })
            $.getJSON(`${serverApiAddr}/json/airport/${item.arriveAirportNo}`, (APName) => {

                item.arriveAirportNo = APName.airport.airportName;
            })
        }
        console.log(result);


        var html = template(result);

        $('#card').html(html);
    })
}

// 이 방식은 실행 시점에 존재하는 태그에 대해서만 이벤트 핸들러를 등록할 수 있다.
/*
 * $('.viewLink').click(function (event) { event.preventDefault(); var id =
 * $(event.currentTarget).attr('data-id'); location.href =
 * `view.html?id=${id}&page=${data.page}&size=${data.size}`; });
 */

// 실행 시점에 존재하지 않더라도 이벤트 핸들러를 등록하는 방법은?
// => 앞으로 생성될 태그의 부모에 리스너를 등록하는 것이다.
