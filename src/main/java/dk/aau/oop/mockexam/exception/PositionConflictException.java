package dk.aau.oop.mockexam.exception;

import java.io.Serial;

public class PositionConflictException extends RuntimeException {
  @Serial private static final long serialVersionUID = -6775120263457912314L;

  public PositionConflictException(final String message) {
    super(message);
  }
}
