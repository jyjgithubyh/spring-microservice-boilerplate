package com.saintdan.framework.param;

import com.saintdan.framework.annotation.NotNullField;
import com.saintdan.framework.enums.GrantType;
import java.io.Serializable;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 15/02/2017
 * @since JDK1.8
 */
@Data  @Builder @NoArgsConstructor @AllArgsConstructor
public class LoginParam implements Serializable {

  private static final long serialVersionUID = 1148462952236125805L;

  @NotNullField(grant = GrantType.PASSWORD, message = "usr cannot be null.")
  @Size(min = 4, max = 50, message = "usr must greater than or equal to 4 and less than or equal to 50.")
  private String usr;

  @NotNullField(grant = GrantType.PASSWORD, message = "pwd cannot be null.")
  @Size(min = 4, max = 16, message = "pwd must greater than or equal to 4 and less than or equal to 16.")
  private String pwd;

  @NotNullField(grant = GrantType.REFRESH_TOKEN, message = "refresh token cannot be null.")
  private String refreshToken;
}
