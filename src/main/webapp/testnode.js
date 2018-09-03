'use strict'
const express = require('express');
const app = express();
const mysql = require('mysql');

var pool = mysql.createPool({
    connectionLimit: 10,
    host: "52.79.251.173",
    database: 'bitcamp-newdeal-canoe',
    user: "pm",
    password: "1111"
});

app.get('/checkId', (req, res) => {
    res.setHeader("Access-Control-Allow-Origin", "*");
    res.setHeader("Access-Control-Allow-Headers", "X-Requested-With");
    res.writeHead(200, {'Content-Type': 'text/plain;charset=UTF-8'});

    console.log(req.query.id);
    pool.query(
        'SELECT MID FROM P0_MEMB WHERE MID=?',
        [req.query.id],
        function(err, results){
            if (err) {
                res.end('DB 검색 중 예외 발생!');
                return;
            }
            if (results[0] == undefined || results[0] == '') {
                res.end();
                return;
            }
            console.log(results[0].MID);
            res.end(results[0].MID);
    });
    
    //res.end();
});


// const server = http.createServer((req, res) => {
//     console.log('요청 받았음');
//     res.setHeader("Access-Control-Allow-Origin", "*");
//     res.setHeader("Access-Control-Allow-Headers", "X-Requested-With");
//     res.writeHead(200, {'Content-Type': 'text/plain;charset=UTF-8'});
//     res.end('안녕!');
// });

app.listen(8000,() => {
    console.log('리슨~ 서버 시작됨~')
});
