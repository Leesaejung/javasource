package board.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReplyService;
import board.util.BoardUploadUtils;

public class BoardReplyAction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request) throws Exception {
		BoardUploadUtils utils = new BoardUploadUtils();
		Map<String, String> formData = utils.uploadFile(request);
		
		BoardDTO dto = new BoardDTO();
		// 답변 글 정보
		dto.setName(formData.get("name"));
		dto.setTitle(formData.get("title"));
		dto.setContent(formData.get("content"));
		dto.setPassword(formData.get("password"));
		if (formData.containsKey("attach")) {
			dto.setAttach(formData.get("attach"));
		}
		
		// 원본 글 정보
		int bno = Integer.parseInt(formData.get("bno"));
		dto.setReRef(Integer.parseInt(formData.get("re_ref")));
		dto.setReLev(Integer.parseInt(formData.get("re_lev")));
		dto.setReSeq(Integer.parseInt(formData.get("re_seq")));
		
		//서비스 작업
		BoardReplyService service = new BoardReplyService();
		
		//ActionForward : 성공하면 목록 보여주기, 실패시 writeForm.jsp
		String path = "";
		if(service.replyInsert(dto)) {
			path = "list.do";
		}else {
			path = "replyView.do?bno="+bno;
		}		
		
		return new ActionForward(true, path);
	}

}
