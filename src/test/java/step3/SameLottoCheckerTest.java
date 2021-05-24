package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import step3.domain.Lotto;
import step3.domain.SameLottoChecker;

import java.util.Arrays;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;


class SameLottoCheckerTest {


    @Test
    @DisplayName("3개의 일치 하는 로또 번호를 가지는 경우")
    void hasThreeSameLotto() {
        Lotto given = new Lotto(new TreeSet<>(Arrays.asList(39, 19, 26, 34, 36, 31)));
        Lotto result = new Lotto(new TreeSet<>(Arrays.asList(1, 3, 39, 19, 26, 2)));

        assertThat(SameLottoChecker.countSameLottoNum(given, result)).isEqualTo(3);
    }

    @Test
    @DisplayName("6개의 일치 하는 로또 번호를 가지는 경우")
    void hasSixSameLotto() {
        Lotto given = new Lotto(new TreeSet<>(Arrays.asList(40, 41, 42, 43, 44, 45)));
        Lotto result = new Lotto(new TreeSet<>(Arrays.asList(45, 42, 43, 40, 44, 41)));

        assertThat(SameLottoChecker.countSameLottoNum(given, result)).isEqualTo(6);
    }

}