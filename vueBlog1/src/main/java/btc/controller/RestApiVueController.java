package btc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import btc.dto.AxiosBoardDto;
import btc.dto.ReplyDto;
import btc.service.VueBoardService;

// @RestController : @Controller 어노테이션과 비동기 통신 시 사용했던 @ResponseBody 어노테이션이 하나로 합쳐진 어노테이션
@RestController
public class RestApiVueController {
	
	@Autowired
	private VueBoardService vbService;
	
//	전체 리스트 불러오기
	@RequestMapping(value="/vue/axiosBoardList", method=RequestMethod.GET)
	public Object vueSelectBoardList() throws Exception {
		List<AxiosBoardDto> dataList = vbService.vueSelectBoardList();
		
		return dataList;
	}
	
//	지정한 게시판 글 확인하기
	@RequestMapping(value="/vue/axiosBoardDetail", method=RequestMethod.GET)
	public Object vueSelectBoardDetial(@RequestParam("seq") int seq) throws Exception {
		AxiosBoardDto board = vbService.vueSelectDetailBoard(seq);
		
		return board;
	}
	
//	새로운 게시글 등록하기
	@RequestMapping(value="/vue/axiosBoardInsert", method=RequestMethod.POST)
	public void vueBoardInsert(@RequestBody AxiosBoardDto board) throws Exception {
		vbService.vueInsertBoard(board);
	}
	
//	지정한 게시글 수정하기
	@RequestMapping(value="/vue/axiosBoardUpdate", method=RequestMethod.PUT)
	public void vueBoardUpdate(@RequestBody AxiosBoardDto board) throws Exception {
		vbService.vueUpdateBoard(board);
	}
	
//	지정한 게시글 삭제하기
	@RequestMapping(value="/vue/axiosBoardDelete", method=RequestMethod.DELETE)
	public void vueBoardDelete(@RequestParam("seq") int seq) throws Exception {
		vbService.vueDeleteBoard(seq);
	}
	
//	댓글 보기
	@RequestMapping(value="/vue/replyList", method=RequestMethod.GET)
	public Object replyList(@RequestParam("blogSeq") int blogSeq) throws Exception {
		List<ReplyDto> dataList = vbService.replyList(blogSeq);
		
		return dataList;
	}
	
//	댓글 등록하기
	@RequestMapping(value="/vue/replyInsert", method=RequestMethod.POST)
	public void replyInsert(@RequestBody ReplyDto board) throws Exception {
		vbService.replyInsert(board);
	}
	
	
//	댓글 삭제하기
	@RequestMapping(value="/vue/replyDelete", method=RequestMethod.DELETE)
	public void replyDelete(@RequestParam("seq") int seq) throws Exception {
		vbService.replyDelete(seq);
	}
	
}
