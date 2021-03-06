package dev.mvc.member_word;

import java.util.List;

public interface Member_WordProcInter {

  /**
   * 회원 검색어 등록
   * @param memberno
   * @param wordno
   * @return
   */
  public int create(int memberno, int wordno);
  
  /**
   * 회원 별 검색어번호 목록
   * @param memberno
   * @return
   */
  public List<Word_MemberWordVO> wordno_by_member(int memberno);
  
  /**
   * 특정 검색어를 어떤 회원이 검색했는지
   * @param wordno
   * @return
   */
  public List<Word_MemberWordVO> member_by_wordno(int wordno);
}
