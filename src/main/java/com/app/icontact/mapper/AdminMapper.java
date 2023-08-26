package com.app.icontact.mapper;

import com.app.icontact.DTO.CommunityDTO;
import com.app.icontact.DTO.InquiryDTO;
import com.app.icontact.DTO.Pagination;
import com.app.icontact.domain.AnswerVO;
import com.app.icontact.domain.InquiryVO;
import com.app.icontact.domain.NoticeVO;
import com.app.icontact.domain.PaymentVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AdminMapper {
    //공지사항 작성
    public void insertNotice(NoticeVO noticeVO);


    //문의목록 보기
    public List<InquiryDTO> selectAllInquiry(@Param("pagination") Pagination pagination);

    //문의 보기
    public Optional<InquiryVO> selectInquiry(Long id);

    //문의 답변하기
    public void insertAnswer(AnswerVO answerVO);

    //커뮤니티 관리목록 보기
    public List<CommunityDTO> selectAllCommunity (@Param("pagination") Pagination pagination);

    //커뮤니티 글 삭제
    public String deleteCommunity(String communityId);

    //결제목록 보기
    public List<PaymentVO> selectAllPayment(@Param("pagination") Pagination pagination);

    //결제 취소
    public String updateCancel(String paymentId);

    //회원목록보기(최신순)

    //회원상세보기(그 회원의 마이페이지로 이동)

    //커뮤니티 글목록 보기

    //커뮤니티 글 수정(글 수정페이지로 이동)

    //커뮤니티 글 삭제


}
