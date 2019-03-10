package com.action;

import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

public class MemberRegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Member member;
	private MemberService memberService;
	public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return member;
	}
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	public MemberService getMemberService() {
		return memberService;
	}
	public String execute(){
		memberService.add(member);
		return SUCCESS;
	}
}
