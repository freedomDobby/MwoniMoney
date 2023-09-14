package com.ntt.mwonimoney.domain.member.model.dto;

import com.ntt.mwonimoney.domain.member.model.vo.SmallAccount;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ChildDto extends MemberDto {

	private byte creditScore;
	
	private SmallAccount smallAccount;

}