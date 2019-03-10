package com.service;

import java.util.List;

import com.dao.MemberDAO;
import com.entity.Member;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDao;
	
	public void add(Member member){
		System.out.println(member.getId());
		if(memberDao.findById(member.getId()) == null){
			memberDao.add(member);
		}
	}
	public void update(Member member){
		if(memberDao.findById(member.getId()) != null){
			memberDao.update(member);
		}
	}
	public void delete(long id){
		if(memberDao.findById(id) != null){
			memberDao.delete(id);
		}
	}
	public Member findByName(String name, String password){
		return memberDao.findByName(name, password);
	}
	public Member findById(long id){
		return memberDao.findById(id);
	}
	public List<Member> findAll(){
		return memberDao.findAll();
	}
	public void setMemberDao(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public MemberDAO getMemberDao() {
		return memberDao;
	}
}
