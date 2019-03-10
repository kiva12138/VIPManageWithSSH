package com.action;

import com.entity.Member;
import com.opensymphony.xwork2.ActionSupport;
import com.service.MemberService;

public class MemberLoginAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private Member member;
	private MemberService memberService;
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public MemberService getMemberService() {
		return memberService;
	}
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	public String execute() {
		Member member = memberService.findByName(this.member.getName(), this.member.getPassword());
		if(member!=null) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
}
