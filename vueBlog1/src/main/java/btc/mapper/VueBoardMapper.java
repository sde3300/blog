package btc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import btc.dto.AxiosBoardDto;
import btc.dto.ReplyDto;

@Mapper
public interface VueBoardMapper {
	List<AxiosBoardDto> vueSelectBoardList() throws Exception;
	
	void vueInsertBoard(AxiosBoardDto board) throws Exception;
	
	AxiosBoardDto vueSelectDetailBoard(int seq) throws Exception;
	
	void vueUpdateBoard(AxiosBoardDto board) throws Exception;
	
	void vueDeleteBoard(int seq) throws Exception;
	
//	댓글
	List<ReplyDto> replyList(int blogSeq) throws Exception;
	
	void replyInsert(ReplyDto board) throws Exception;
	
	void replyDelete(int seq) throws Exception;
}