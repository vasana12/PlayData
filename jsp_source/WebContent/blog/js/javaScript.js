/**
 * 2018-06-17 김경우
 */
$(document).ready(function(){
	
	// 마우스가 오버 되었을 때
	$('.menuTitle').on("mouseover",function(){
		$(".innerMenu").slideDown();
	});
	
	// 마우스가 나갔을 때
	$(".innerMenu").on("mouseleave", function(){
		$(".innerMenu").slideUp();
	});
	
	//네비게이션바 html링크 선택시 ARTICLE 부분 문서 불러오기
	$(".innerMenuItem1:nth-child(1)").on("click", function(){
		$.ajax({
			url: "../html/htmlMenu1.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem1:nth-child(2)").on("click", function(){
		$.ajax({
			url: "../html/htmlMenu2.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem1:nth-child(3)").on("click", function(){
		$.ajax({
			url: "../html/htmlMenu3.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	
	//네비게이션바 css링크 선택시 ARTICLE 부분 문서 불러오기
	$(".innerMenuItem2:nth-child(1)").on("click", function(){
		$.ajax({
			url: "../html/css1.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem2:nth-child(2)").on("click", function(){
		$.ajax({
			url: "../html/css2.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem2:nth-child(3)").on("click", function(){
		$.ajax({
			url: "../html/css3.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	
	//네비게이션바 js링크 선택시 ARTICLE 부분 문서 불러오기
	$(".innerMenuItem3:nth-child(1)").on("click", function(){
		$.ajax({
			url: "../html/javascript1.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem3:nth-child(2)").on("click", function(){
		$.ajax({
			url: "../html/javascript2.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	$(".innerMenuItem3:nth-child(3)").on("click", function(){
		$.ajax({
			url: "../html/javascript3.html",
			type: "get",
			dataType: "html",
			success: function(e) {
				$(".article1").html(e);
			}
		});
	});
	
});

