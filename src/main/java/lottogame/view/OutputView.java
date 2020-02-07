package lottogame.view;

import lottogame.domain.LottoTicket;
import lottogame.domain.LottoTickets;

import java.util.Scanner;

public class OutputView {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String MESSAGE_PRINT_LOTTO_COUNT = "개를 구매했습니다.";

    public void printLottoCount(int lottoCount) {
        System.out.println(lottoCount + MESSAGE_PRINT_LOTTO_COUNT);
    }

    public void printLottoTickets(LottoTickets lottoTickets) {
        for(LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            printLottoTicket(lottoTicket);
        }
    }

    private void printLottoTicket(LottoTicket lottoTicket) {
        System.out.println(lottoTicket.toString());
    }
}