package com.example.board;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate sqlSession;
	public int insertBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.insertBoard", vo);
		return result;
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	//public int insertBoard(BoardVO vo){
	//String sql = "insert into BOARD (category,professor,grade,major,place,duedate,content) values("
	//			+"'"+vo.getCategory()+"',"
	//			+"'"+vo.getProfessor()+"',"
	//			+"'"+vo.getGrade()+"',"
	//			+"'"+vo.getMajor()+"',"
	//			+"'"+vo.getPlace()+"',"
	//			+"'"+vo.getDuedate()+"',"
	//			+"'"+vo.getContent()+"')";
	//	return jdbcTemplate.update(sql);
	//}
	public int deleteBoard(int seq){
		String sql = "delete from BOARD where seq= " +seq;
		return jdbcTemplate.update(sql);
	}

	public int updateBoard(BoardVO vo){
		String sql = "update BOARD set category='"+vo.getCategory()+"', "
				+"professor= '" + vo.getProfessor()+"', "
				+"grade= '" + vo.getGrade() +"', "
				+"major= '" + vo.getMajor() +"', "
				+"place= '" + vo.getPlace() +"', "
				+"duedate= '" + vo.getDuedate() +"', "
				+"content= '" + vo.getContent() +"' where seq="
				+ vo.getSeq();
		return jdbcTemplate.update(sql);
	}

	public BoardVO getBoard(int seq){
		BoardVO one = sqlSession.selectOne("Board.getBoard",seq);
		return one;
	}
	public List<BoardVO> getBoardList(){
		List<BoardVO>list = sqlSession.selectList("Board.getBoardList");
		return list;
	}

	//public BoardVO getBoard(int seq){
	//	String sql = "select *from BOARD where seq="+seq;
	//	return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
	//}
	//public List<BoardVO> getBoardList(){
	//	String sql = "select * from BOARD order by regdate desc";
	//	return jdbcTemplate.query(sql,new BoardRowMapper());
	//}
}

class BoardRowMapper implements RowMapper<BoardVO>{
	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
		BoardVO vo = new BoardVO();
		vo.setSeq(rs.getInt("seq"));
		vo.setCategory(rs.getString("category"));
		vo.setProfessor(rs.getString("professor"));
		vo.setGrade(rs.getString("grade"));
		vo.setMajor(rs.getString("major"));
		vo.setPlace(rs.getString("place"));
		vo.setContent(rs.getString("content"));
		vo.setDuedate(rs.getString("duedate"));
		return vo;
	}
}