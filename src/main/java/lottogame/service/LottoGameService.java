package lottogame.service;

import lottogame.domain.MoneyAmount;
import lottogame.domain.lottoticket.LottoTicket;
import lottogame.domain.lottoticket.LottoTickets;
import lottogame.domain.statistics.WinningStatistics;

public class LottoGameService {

    public MoneyAmount getMoneyAmount(int input) {
        return new MoneyAmount(input);
    }

    public int getLottoCount(MoneyAmount moneyAmount) {
        return moneyAmount.calculateLottoCount();
    }

    public LottoTickets generateLottoTickets(int lottoCount) {
        return LottoTickets.with(lottoCount);
    }

    public LottoTicket generateLottoTicket(String lottoNumbersString) {
        return LottoTicket.of(lottoNumbersString);
    }

    public WinningStatistics generateWinningStatistics(LottoTickets lottoTickets, LottoTicket lottoResult) {
        return WinningStatistics.computeLottoStatistics(lottoTickets, lottoResult);
    }
}
