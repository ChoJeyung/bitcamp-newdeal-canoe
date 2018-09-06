"use strict"
function onSignIn(googleUser) {
	var profile = googleUser.getBasicProfile();
	console.log('ID: ' + profile.getId()); // Do not send to your backend! Use
											// an ID token instead.
	console.log('Name: ' + profile.getName());
	console.log('Image URL: ' + profile.getImageUrl());
	console.log('Email: ' + profile.getEmail()); // This is null if the
													// 'email' scope is not
													// present.
	var r = confirm("회원 가입 하실래요?")
	if(r == true) {
		console.log($('#input-id').val());
		$('#input-id').val(profile.getEmail());
		$('#input-name').val(profile.getName());
	}else {
		location.href="main.html";
	}
	
}