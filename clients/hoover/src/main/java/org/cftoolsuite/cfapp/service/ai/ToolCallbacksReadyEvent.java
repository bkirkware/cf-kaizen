package org.cftoolsuite.cfapp.service.ai;

import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class ToolCallbacksReadyEvent extends ApplicationEvent {

    private List<ToolCallback> toolCallbacks;

    public ToolCallbacksReadyEvent(Object source) {
        super(source);
    }

    public ToolCallbacksReadyEvent toolCallbacks(List<ToolCallback> toolCallbacks) {
        this.toolCallbacks = toolCallbacks;
        return this;
    }

    public List<ToolCallback> getToolCallbacks() {
        return toolCallbacks;
    }
}
