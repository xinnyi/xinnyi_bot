package ch.nyp.xinnyi.bot.telegram.dtos;

import ch.nyp.xinnyi.core.ExtendedDTO;

import java.util.List;

public class ReplayMarkup implements ExtendedDTO {
    private List<List<Button>> inline_keyboard;  // one of InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply

    public ReplayMarkup(List<List<Button>> inlineKeyboard) {
        this.inline_keyboard = inlineKeyboard;
    }

    public List<List<Button>> getInlineKeyboard() {
        return inline_keyboard;
    }

    public ReplayMarkup setInlineKeyboard(List<List<Button>> inlineKeyboard) {
        this.inline_keyboard = inlineKeyboard;
        return this;
    }
}
