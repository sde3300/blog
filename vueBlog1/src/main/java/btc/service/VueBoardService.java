package btc.service;

import java.util.List;

import btc.dto.AxiosBoardDto;
import btc.dto.ReplyDto;

public interface VueBoardService {
//	전체 리스트 가져오기
	List<AxiosBoardDto> vueSelectBoardList() throws Exception;
	
//	입력된 데이터 DB에 저장하기
	void vueInsertBoard(AxiosBoardDto board) throws Exception;
	
//	지정한 데이터를 DB 에서 출력하기
	AxiosBoardDto vueSelectDetailBoard(int seq) throws Exception;
	
	void vueUpdateBoard(AxiosBoardDto board) throws Exception;
	
	void vueDeleteBoard(int seq) throws Exception;
	
	
//	댓글
	List<ReplyDto> replyList(int blogSeq) throws Exception;
	
	void replyInsert(ReplyDto board) throws Exception;
	
	void replyDelete(int seq) throws Exception;
}
