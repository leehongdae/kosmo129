<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<!-- 디바이스에 최적화된 크기로 출력됨 -->
		<meta name="viewport" content="width=device-width, initial-scale=1.0
     			maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>     	
     	
   	
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
		
		<script type="text/javascript">
			
			alert(">>> Js In");
			
			$(document).ready(function() {
				alert(">>> jQuery In");
				
				// 아이디 비동기 ajax 중복체크
				$(document).on("click", "#midbtn", function() {
					alert(">>> midbtn.click() In");
					
					let idCheckURL = "kosIdCheck.lhd";
					let reqType = "GET";
					let dataParam = {mid: $("#mid").val(),};
					
					$.ajax({
						url		: idCheckURL,
						type	: reqType,
						data	: dataParam,
						success : whenSuccess,
						error	: whenError
					}); // end of ajax()
					
					function whenSuccess(resData) {						
						alert(">>> resData : " + resData);
						
						if("ID_YES" == resData) {							
							alert(">>> 아이디 사용 가능 : ID_YES");
							
							$("#mkid").css('background-color', 'yellow');
							$("#mid").attr("readonly", true);
							$("#mpw").focus();
						}else {
							alert(">>> 아이디 이미 사용중 : ID_NO");
							
							$("#mid").val('');
							$("#mid").focus();
						} // end of if-else(id중복체크)
					} // end of whenSuccess()
					
					function whenError(e) {
						alert(">>> e : " + e.responseText);
					} // end of whenError()
				}); // end of midbtn.click()
				
				// 비밀번호 체크
				$("#pwCheck").click(function() {
					alert(">>> pwCheck.click() In");
					
					var pw = $("#mpw").val();
					var pw_r = $("#mpw_r").val();
					alert(">>> mpw : " + mpw);
					alert(">>> mpw_r : " + mpw_r);
					
					if(pw == pw_r) {
						alert(">>> 비밀번호가 같습니다.");
						$("#mgender").focus();
						return;						
					}else {
						alert(">>> 비밀번호가 다릅니다.");
						$("#mpw").val('');
						$("#mpw_r").val('');
						$("#mpw").focus();
						return false;						
					} // end of if-else
				}); // end of pwCheck.click()
				
				// 생년월일
				$("#mbirth").on("input", function() {
					
					var m = $("#mbirth");
					if(m.val().length > m.maxlength) {
						m.value = m.value.slice(0, m.maxlength);						
					}
				}); // end of mbirth.input()
				
				// 월
				$("#mbirth1").append("<option value=''>월---</option>");
				   for(var i = 1; i <= 12; i++){
			        	if (i < 10){ i = '0'+i;}
			            $("#mbirth1").append("<option value='"+ i +"'>"+ i + "</option>");
			        }
		        
				// 일
				$("#mbirth2").append("<option value=''>일---</option>");
				for(var i=1; i<=31; i++) {
					if(i<10) { i = '0' + i;}
					$("#mbirth2").append("<option value='"+i+"'>"+i+"</option>");
				}				
				// email
				$("#memail2").change(function() {
					
					$("#memail2 option:selected").each(function() {
						if($(this).val() == '1') {
							var aa = $("#memail1").val();
							$("#memail1").val('');
							$("#memail1").attr();
						}else {
							$("#memail1").val($(this).text());
							$("#memail1").attr("readonly", true);							
						}						
					}); // end of memail2.each()
				}); // end memail.2.change()
				
				// 우편번호
				$("#mzonecode").prop('readonly',true);
				$("#mroadaddr").prop('readonly',true);
				$("#mjibunaddr").prop('readonly',true);
				$("#zonecode").click(function() {
					alert(">>> zonecode In");
					new daum.Postcode({
						oncomplete: function(data) {
							$("#mzonecode").val(data.zonecode);
							$("#mroadaddr").val(data.roadAddress);
							$("#mjibunaddr").val(data.jibunAddress);
						}
						
					}).open();					
				}); // zonecode.click()
				
				// 폼태그 실행
				$(document).on("click", "#btn", function() {
					alert(">>> form In");
					
					$("#memForm").attr({
						"action":"memInsert.lhd",
						"method":"POST",
						"enctype":"multipart/form-data"
					}).submit();					
				}); // end of click()
				
			}); // end of ready()
		
		</script>
		
		<style type="text/css">
			
			div {
				margin: 0 auto;
				border: 1px solid #2E2E2E;
				display: table;				
			}
			
			td, th {
				padding:5px;
			}
			
			h3 {
				text-align: center;
			}
			
			table, th, td {
				border: 1px solid black;
			}
			
			.td, .mem {
				text-align: center;
				text-color: #2E2E2E;
				 
			}
			
			.tooltiptext:after, tooltiptext:before {
				top: 100%;
				left: 20%;
				border: solid transparent;
				content:"";
				height: 0;
				width: 0;
				position: absolute;
				pointer-events: none;
			}
			
			.tooltiptext:after, .tooltiptext:before {
				top: 100%;
				left: 20%;
				border: solid transparent;
				content: "";
				height: 0;
				width: 0;
				position: absolute;
				pointer-events: none;
			}
			
			.tooltiptext:after {
				border-color: rgba(255, 255, 255, 0);
				border-top-color: #fff;
				border-width: 13px;
				margin-left: -20px;
			}
			
			.tooltiptext:before {
				border-color: rgba(204, 204, 204, 0);
				border-top-color: #ccc;
				border-width: 13px;
				margin-left: -20px;
				margin-top: 2px;
			}
			
			.tooltip {
				position: relative;
				display: inline-block;
			}
			
			.tooltip .tooltiptext {
				visibility: hidden;
				width: 260px;
				background-color: white;
				color: #cc5200;
				text-align: left;
				border-radius: 6px;
				padding: 5px 0;
				font-size: 14px;
				border: 2px solid #ccc;
				radius: 8px;
				
				position: absolute;
				bottom: 140%;
				left: -10%;
				z-index: 50;
			}
			
			.tooltip:hover .tooltiptext {
				visibility: visible;				
			}
			
			.hr_dash {
				border:1px dashed #ccc;
			}
			
			#header {
				text-align; center;
			}
			
			font-family: 'jua', sans-serif;
		</style>
	</head>
	
	
	<body>
		<h3><font size="4" style="color:blue">SPRING MYBATIS 회원가입</font></h3>
		<hr>
		<div>
			<form name="memForm" id="memForm">
				<table>
					<tr>
						<td colspan="2" align="center">
							<font>KOSMO 129기</font>
							<img src="/kosSpring/img/img_mandu/ase1.gif" width="25" height="25" alt="image">
						</td>
					</tr>
					<tr>
						<td class='td'>회원번호</td>
						<td><input type="text" name="mnum" id="mnum" style="background-color:#E6E6E6;" readonly></td>
					</tr>
					<tr>
						<td class='td'>이름</td>
						<td><input type="text" name="mname" id="mname"></td>
					</tr>
					<tr>
						<td class='td'>아이디</td>
						<td>
							<input type="text" name="mid" id="mid" placeholder="아이디체크" style="width:100px">
							<input type="button" name="midbtn" id="midbtn" value="아이디중복확인">
						</td>
					</tr>
					<tr>
						<td class='td'>패스워드</td>
						<td>
							<div class="tooltip" margin="0px 0px 0px 0px">
								<span class="tooltiptext" style="font-size:14px; font-family:'jua';">
									<span style="font-size:16px">&nbsp;&nbsp; 해당 조건을 만족시켜 주십시오.</span>
									<hr class="hr_dash">
									&nbsp;&nbsp;<img src="/kosSpring/img/img_ex/notice.png" width="18px" height="17px">영문자 사용(공백 사용 x)<br>
									&nbsp;&nbsp;<img src="/kosSpring/img/img_ex/notice.png" width="18px" height="17px">특수문자 사용(공백 사용 x)<br>
									&nbsp;&nbsp;<img src="/kosSpring/img/img_ex/notice.png" width="18px" height="17px">숫자 사용<br>
									&nbsp;&nbsp;<img src="/kosSpring/img/img_ex/notice.png" width="18px" height="17px">8글자 이상 ~12자 이하 <br><br>								
								</span>
								<input type="text" class="imf" name="mpw" id="mpw" placeholder="비밀번호  8자리" style="width:100px" maxlength="8">
							</div><br>
							<input type="password" name="mpw_r" id="mpw_r" placeholder="비밀번호확인" style="width:100px" >
							<input type="button" id="pwCheck" value="비밀번호 확인">
						</td>
					</tr>
					<tr>
						<td class='td'>성별</td>
						<td>
							<input type="radio" name="mgender" id="mgender_f" value="F" checked>Female
							<input type="radio" name="mgender" id="mgender_m" value="M">Male
					</tr>
					<tr>
						<td class='td'>생년월일</td>
						<td>
							<input type="text" name="mbirth" id="mbirth" placeholder="년(4자)" maxlength="4" style="width:50px">
							<select name="mbirth1" id="mbirth1"></select>
							<select name="mbirth2" id="mbirth2"></select>
						</td>						
					</tr>
					<tr>
						<td class='td'>핸드폰</td>
						<td>
							<select name="mhp" id="mhp">
								<option value="010">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
							</select>
							-<input type="text" name="mhp1" id="mhp1" size="2">
							-<input type="text" name="mhp2" id="mhp2" size="2">
						</td>
					</tr>
					<tr>
						<td class='td'>전화번호</td>
						<td>
							<select name="mtel" id="mtel">
								<option value="02">02</option>
								<option value="031">031</option>
								<option value="041">041</option>
								<option value="051">051</option>
								<option value="061">061</option>
							</select>
							-<input type="text" name="mtel1" id="mtel1" size="2">
							-<input type="text" name="mtel2" id="mtel2" size="2">
							
						</td>
					</tr>
					<tr>
						<td class='td'>이메일</td>
						<td>
							<input type="text" name="memail" id="memail" style="width:100px">
							@<input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력">
							<select name="memal2" id="memail2" style="width:100px; margin-right=:10px;">
								<option value="1" selected>직접입력</option>
								<option value="naver.com">naver.com</option>
								<option value="gmail.com">gmail.com</option>
								<option value="daum.net">daum.net</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="mem">주소</td>
						<td>
							<input type="text" name="mzonecode" id="mzonecode" placeholder="우편번호" style="width:50px">
							<input type="button" name="zonecode" id="zonecode" value="우편번호 찾기"><br>
							<input type="text" name="mroadaddr" id="mroadaddr" placeholder="도로명주소" style="width:250px"><br>
							<input type="text" name="mroaddetail" id="mroaddetail" placeholder="도로명주소 상세주소" style="width:250px"><br>
							<input type="text" name="mjibunaddr" id="mjibunaddr" placeholder="지번 주소" style="width:250px"><br>							
						</td>
					</tr>
					<tr>
						<td class='td'>취미</td>
						<td>
							<input type="checkbox" name="mhobby" value="mh1">알고리즘
							<input type="checkbox" name="mhobby" value="mh2">코딩
							<input type="checkbox" name="mhobby" value="mh3">분석설계<br>
							<input type="checkbox" name="mhobby" value="mh4">데이터베이스
							<input type="checkbox" name="mhobby" value="mh5">스크립트							
						</td>
					</tr>
					<tr>
						<td class='td'>소개글</td>
						<td>
							<textarea name="minfo" id="minfo" rows="5" cols="50" >내 소개글
							</textarea>
						</td>
					</tr>
					<tr>
						<td class='td'>사진</td>
						<td>
							<input type="file" name="mphoto">
						</td>
					</tr>
					<tr >
						<td colspan="2" align="right">
							<button type="button" id="btn">보내기</button>
							<button type="reset" id="reset">다시</button>
						</td>
					</tr>
				</table>
			</form>
		</div>	
	</body>
</html>