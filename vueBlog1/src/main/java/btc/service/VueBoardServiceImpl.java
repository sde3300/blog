package btc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import btc.dto.AxiosBoardDto;
import btc.dto.ReplyDto;
import btc.mapper.VueBoardMapper;

@Service
public class VueBoardServiceImpl implements VueBoardService {

	@Autowired
	private VueBoardMapper vbMapper;
	
	@Override
	public List<AxiosBoardDto> vueSelectBoardList() throws Exception {
		return vbMapper.vueSelectBoardList();
	}
	
	@Override
	public void vueInsertBoard(AxiosBoardDto board) throws Exception {
		vbMapper.vueInsertBoard(board);
	}
	
	@Override
	public AxiosBoardDto vueSelectDetailBoard(int seq) throws Exception {
		return vbMapper.vueSelectDetailBoard(seq);
	}
	
	@Override
	public void vueUpdateBoard(AxiosBoardDto board) throws Exception {
		vbMapper.vueUpdateBoard(board);
	}

	@Override
	public void vueDeleteBoard(int seq) throws Exception {
		vbMapper.vueDeleteBoard(seq);
	}
	
	
//	댓글 
	@Override
	public List<ReplyDto> replyList(int blogSeq) throws Exception {
		List<ReplyDto> list = vbMapper.replyList(blogSeq);
		
		return list;
//		return vbMapper.replyList(blogSeq);
	}
	
	@Override
	public void replyInsert(ReplyDto board) throws Exception {
		vbMapper.replyInsert(board);
	}
	
	@Override
	public void replyDelete(int seq) throws Exception {
		vbMapper.replyDelete(seq);
	}
}
