/**
 * 
 */

const modifyForm = document.querySelector("#modifyForm");

 document.querySelector(".btn-success").addEventListener("click",()=>{
	 location.href="list.do"
 })
 
// 삭제버튼 클릭 시 modifyForm 전송
// action=delete.do 
 document.querySelector(".btn-danger").addEventListener("click",(e)=>{
	 
	 // .btn-danger을 submit으로 했을 때 / button으로 했을 때는 e.preventDefault();를 쓰지 않아도 됨
	 e.preventDefault(); 
	 //password 입력했는지 확인
	 const password = document.querySelector("#inputPassword");
	 
	 if(password.value == ""){
		 alert("비밀번호를 입력해주세요");
		 password.focus();
		 return;
	 }
	 
	 // 사용자가 입력한 비밀번호를 가져와서
	 // id, password value 값으로 세팅
	 document.querySelector("#password").value = password.value;
	 
	 modifyForm.action = "delete.do";
	 modifyForm.method = "post";
	 console.log(modifyForm);
	 modifyForm.submit();
 })