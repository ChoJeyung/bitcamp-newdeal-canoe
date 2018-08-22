package bitcamp.newdeal.canoe.domain;

import java.util.Date;

public class Member {
	protected int		memberNo;
	protected String	memberId;
	protected String	memberName;
	protected String	memberPwd;
	protected Date		memberEntryDate;
	protected Date		memberModifyDate;

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public Date getMemberEntryDate() {
		return memberEntryDate;
	}

	public void setMemberEntryDate(Date memberEntryDate) {
		this.memberEntryDate = memberEntryDate;
	}

	public Date getMemberModifyDate() {
		return memberModifyDate;
	}

	public void setMemberModifyDate(Date memberModifyDate) {
		this.memberModifyDate = memberModifyDate;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberName=" + memberName + ", memberPwd="
		        + memberPwd + ", memberEntryDate=" + memberEntryDate + ", memberModifyDate=" + memberModifyDate + "]";
	}
}
