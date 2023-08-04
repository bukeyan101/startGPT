package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.ChatRoomVO;
import com.hncboy.chatgpt.base.domain.entity.ChatRoomDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-01T09:52:33+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ChatRoomConverterImpl implements ChatRoomConverter {

    @Override
    public List<ChatRoomVO> entityToVO(List<ChatRoomDO> chatRoomDOList) {
        if ( chatRoomDOList == null ) {
            return null;
        }

        List<ChatRoomVO> list = new ArrayList<ChatRoomVO>( chatRoomDOList.size() );
        for ( ChatRoomDO chatRoomDO : chatRoomDOList ) {
            list.add( chatRoomDOToChatRoomVO( chatRoomDO ) );
        }

        return list;
    }

    protected ChatRoomVO chatRoomDOToChatRoomVO(ChatRoomDO chatRoomDO) {
        if ( chatRoomDO == null ) {
            return null;
        }

        ChatRoomVO chatRoomVO = new ChatRoomVO();

        chatRoomVO.setId( chatRoomDO.getId() );
        chatRoomVO.setConversationId( chatRoomDO.getConversationId() );
        chatRoomVO.setIp( chatRoomDO.getIp() );
        chatRoomVO.setFirstMessageId( chatRoomDO.getFirstMessageId() );
        chatRoomVO.setTitle( chatRoomDO.getTitle() );
        chatRoomVO.setApiType( chatRoomDO.getApiType() );
        chatRoomVO.setCreateTime( chatRoomDO.getCreateTime() );
        chatRoomVO.setUpdateTime( chatRoomDO.getUpdateTime() );

        return chatRoomVO;
    }
}
