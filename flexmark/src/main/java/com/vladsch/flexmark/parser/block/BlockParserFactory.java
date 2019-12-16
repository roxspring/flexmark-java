package com.vladsch.flexmark.parser.block;

import com.vladsch.flexmark.parser.SpecialLeadInHandler;
import org.jetbrains.annotations.Nullable;

/**
 * Parser factory for a block node for determining when a block starts.
 * <p>
 * Implementations should subclass {@link AbstractBlockParserFactory} instead of implementing this directly.
 */
public interface BlockParserFactory {
    BlockStart tryStart(ParserState state, MatchedBlockParser matchedBlockParser);
}
