package com.ruoyi.web.platform.member.service;

import java.util.List;

import com.ruoyi.web.platform.member.domain.OverseasStudyMember;

/**
 * 留学归国人员Service接口
 *
 * @author party-platform
 * @date 2020-10-24
 */
public interface IOverseasStudyMemberService {
    /**
     * 查询留学归国人员
     *
     * @param overseasId 留学归国人员ID
     * @return 留学归国人员
     */
    public OverseasStudyMember selectOverseasStudyMemberById(Long overseasId);

    /**
     * 查询留学归国人员列表
     *
     * @param overseasStudyMember 留学归国人员
     * @return 留学归国人员集合
     */
    public List<OverseasStudyMember> selectOverseasStudyMemberList(OverseasStudyMember overseasStudyMember);

    /**
     * 新增留学归国人员
     *
     * @param overseasStudyMember 留学归国人员
     * @return 结果
     */
    public int insertOverseasStudyMember(OverseasStudyMember overseasStudyMember);

    /**
     * 修改留学归国人员
     *
     * @param overseasStudyMember 留学归国人员
     * @return 结果
     */
    public int updateOverseasStudyMember(OverseasStudyMember overseasStudyMember);

    /**
     * 批量删除留学归国人员
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOverseasStudyMemberByIds(String ids);

    /**
     * 删除留学归国人员信息
     *
     * @param overseasId 留学归国人员ID
     * @return 结果
     */
    public int deleteOverseasStudyMemberById(Long overseasId);
}
