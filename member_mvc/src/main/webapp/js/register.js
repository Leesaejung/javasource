/**
 * 폼 모든 요소가 비어있는지 확인
 * 하나라도 비어있다면 막기
 */

//document.querySelector(".btn-primary").addEventListener("click",()=>location.href=path);

const form = document.querySelector("form");

form.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	const userid = document.querySelector("#userid");
	const password = document.querySelector("#password");
	const name = document.querySelector("#name");
	// 성별은 어떻게?
	const genderm = document.querySelector("#m");
	const genderf = document.querySelector("#f");
	const email = document.querySelector("#email");
	
	if(userid.value === ""){
		alert("아이디를 확인해주세요.");
		userid.select();
		return;
	}else if(password.value === ""){
		alert("비밀번호를 확인해주세요.");
		password.select();
		return;
	}else if(name.value === ""){
		alert("이름을 확인해주세요.");
		name.select();
		return;
	}else if(genderm.value === "" || genderf.value === ""){
		alert("성별을 확인해주세요.");
		return;
	}else if(email.value === ""){
		alert("이메일을 확인해주세요.");
		email.select();
		return;
	}
	form.submit();
	
})