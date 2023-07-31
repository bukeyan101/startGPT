package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.SensitiveWordVO;
import com.hncboy.chatgpt.base.domain.entity.SensitiveWordDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-01T19:04:43+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
public class SensitiveWordConverterImpl implements SensitiveWordConverter {

    @Override
    public List<SensitiveWordVO> entityToVO(List<SensitiveWordDO> sensitiveWordDOList) {
        if ( sensitiveWordDOList == null ) {
            return null;
        }

        List<SensitiveWordVO> list = new ArrayList<SensitiveWordVO>( sensitiveWordDOList.size() );
        for ( SensitiveWordDO sensitiveWordDO : sensitiveWordDOList ) {
            list.add( sensitiveWordDOToSensitiveWordVO( sensitiveWordDO ) );
        }

        return list;
    }

    protected SensitiveWordVO sensitiveWordDOToSensitiveWordVO(SensitiveWordDO sensitiveWordDO) {
        if ( sensitiveWordDO == null ) {
            return null;
        }

        SensitiveWordVO sensitiveWordVO = new SensitiveWordVO();

        sensitiveWordVO.setId( sensitiveWordDO.getId() );
        sensitiveWordVO.setWord( sensitiveWordDO.getWord() );
        sensitiveWordVO.setStatus( sensitiveWordDO.getStatus() );
        sensitiveWordVO.setCreateTime( sensitiveWordDO.getCreateTime() );
        sensitiveWordVO.setUpdateTime( sensitiveWordDO.getUpdateTime() );

        return sensitiveWordVO;
    }
}
