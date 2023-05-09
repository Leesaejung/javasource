/**
 * 
 */
 // readForm을 가져온 후 readForm 전송
	const readForm = document.querySelector("#readForm");

 document.querySelector(".btn-success").addEventListener("click",()=>{
	readForm.action = "list.do"; 
	readForm.submit(); 
 })
 
	
 // 답변 클릭 시
  document.querySelector(".btn-secondary").addEventListener("click",()=>{
	readForm.action = "replyView.do"; 
	readForm.submit(); 
 })
 
 
 // 수정 클릭 시 submit 기능 중지
 document.querySelector("form").addEventListener("submit",(e)=>{
	 e.preventDefault();
	 
 // modify.do
	readForm.action = "modify.do"; 
	readForm.submit(); 
 })