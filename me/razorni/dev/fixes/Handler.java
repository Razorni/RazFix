package me.razorni.dev.fixes;

import me.razorni.dev.*;

public class Handler
{
    private RazMain instance;
    
    public Handler(final RazMain instance) {
        this.instance = instance;
    }
    
    public void enable() {
    }
    
    public void disable() {
    }
    
    public RazMain getInstance() {
        return this.instance;
    }
}
