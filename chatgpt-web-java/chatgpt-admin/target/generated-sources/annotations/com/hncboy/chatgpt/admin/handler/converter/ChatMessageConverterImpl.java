package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.ChatMessageVO;
import com.hncboy.chatgpt.base.domain.entity.ChatMessageDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-01T09:52:34+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
public class ChatMessageConverterImpl implements ChatMessageConverter {

    @Override
    public List<ChatMessageVO> entityToVO(List<ChatMessageDO> chatMessageDOList) {
        if ( chatMessageDOList == null ) {
            return null;
        }

        List<ChatMessageVO> list = new ArrayList<ChatMessageVO>( chatMessageDOList.size() );
        for ( ChatMessageDO chatMessageDO : chatMessageDOList ) {
            list.add( chatMessageDOToChatMessageVO( chatMessageDO ) );
        }

        return list;
    }

    protected ChatMessageVO chatMessageDOToChatMessageVO(ChatMessageDO chatMessageDO) {
        if ( chatMessageDO == null ) {
            return null;
        }

        ChatMessageVO chatMessageVO = new ChatMessageVO();

        chatMessageVO.setMessageId( chatMessageDO.getMessageId() );
        chatMessageVO.setParentMessageId( chatMessageDO.getParentMessageId() );
        chatMessageVO.setParentAnswerMessageId( chatMessageDO.getParentAnswerMessageId() );
        chatMessageVO.setParentQuestionMessageId( chatMessageDO.getParentQuestionMessageId() );
        chatMessageVO.setContextCount( chatMessageDO.getContextCount() );
        chatMessageVO.setQuestionContextCount( chatMessageDO.getQuestionContextCount() );
        chatMessageVO.setMessageType( chatMessageDO.getMessageType() );
        chatMessageVO.setChatRoomId( chatMessageDO.getChatRoomId() );
        chatMessageVO.setConversationId( chatMessageDO.getConversationId() );
        chatMessageVO.setApiType( chatMessageDO.getApiType() );
        chatMessageVO.setIp( chatMessageDO.getIp() );
        chatMessageVO.setContent( chatMessageDO.getContent() );
        chatMessageVO.setResponseErrorData( chatMessageDO.getResponseErrorData() );
        if ( chatMessageDO.getPromptTokens() != null ) {
            chatMessageVO.setPromptTokens( chatMessageDO.getPromptTokens().longValue() );
        }
        if ( chatMessageDO.getCompletionTokens() != null ) {
            chatMessageVO.setCompletionTokens( chatMessageDO.getCompletionTokens().longValue() );
        }
        if ( chatMessageDO.getTotalTokens() != null ) {
            chatMessageVO.setTotalTokens( chatMessageDO.getTotalTokens().longValue() );
        }
        chatMessageVO.setStatus( chatMessageDO.getStatus() );
        chatMessageVO.setCreateTime( chatMessageDO.getCreateTime() );
        chatMessageVO.setUpdateTime( chatMessageDO.getUpdateTime() );

        return chatMessageVO;
    }
}
