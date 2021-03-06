package com.kelab.experiment.service;

import com.kelab.experiment.dal.domain.ExperimentContestDomain;
import com.kelab.experiment.result.UserContestRankResult;
import com.kelab.info.base.PaginationResult;
import com.kelab.info.context.Context;
import com.kelab.info.experiment.info.ExperimentContestInfo;
import com.kelab.info.experiment.info.ExperimentProblemInfo;
import com.kelab.info.experiment.query.ExperimentContestQuery;
import com.kelab.info.experiment.query.ExperimentProblemQuery;

import java.util.List;

public interface ExperimentContestService {

    /**
     * 查询一个班级下实验
     */
    PaginationResult<ExperimentContestInfo> queryContest(Context context, ExperimentContestQuery query);

    /**
     * 创建实验
     */
    void saveContest(Context context, ExperimentContestDomain domain);

    /**
     * 更新实验
     */
    void updateContest(Context context, ExperimentContestDomain domain);

    /**
     * 删除实验
     */
    void deleteContest(Context context, List<Integer> ids);

    /**
     * 通过 contestId 分页查询题目
     */
    PaginationResult<ExperimentProblemInfo> queryByContestIdPage(Context context, ExperimentProblemQuery query);

    /**
     * 实时计算排名
     */
    PaginationResult<UserContestRankResult> queryRankByContestId(Context context, Integer contestId);
}
