package com.mycompany.matdongsan.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mycompany.matdongsan.dto.Member;

@Mapper
public interface MemberDao {

	// 일반 유저 회원가입
//	public int joinByMember(Member member);

	public int insertMemberData(Member member);

	public int getMemberNumberByMemberEmail(int userNumber);

	public Member getMemberDataByUserNumber(int userNumber);

}
