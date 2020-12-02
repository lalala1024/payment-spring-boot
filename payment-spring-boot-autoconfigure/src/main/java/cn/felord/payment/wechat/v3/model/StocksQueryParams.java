package cn.felord.payment.wechat.v3.model;

import cn.felord.payment.wechat.enumeration.StockStatus;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Dax
 * @since 15:16
 */
@Data
public class StocksQueryParams {
    private Integer offset =0;
    private Integer limit = 10;
    private String stockId;
    private LocalDateTime createStartTime;
    private LocalDateTime createEndTime;
    private StockStatus status;

}
