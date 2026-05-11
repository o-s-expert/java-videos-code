package expert.os.videos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    //test list
    //when the payment is processed as success
    //when the payment is processed as failure
    //when the payment is processed as pending
    //when I add a credit card to a user
    //when I add an invalid credit card to a user

    @Nested
    @DisplayName("When the payment is processed")
    class WhenPaymentIsProcess{

        @Test
        @DisplayName("should do payment as success if the credit card is valid")
        void shouldDoPaymentAsSuccess(){

        }

        @Test
        @DisplayName("should do payment as failure if the credit card is invalid")
        void shouldDoPaymentAsFailure(){

        }

        @Test
        @DisplayName("should do payment as pending if the credit card is valid but the user has not enough balance")
        void shouldDoPaymentFailureWhenThereIsNotEnoughBalance(){

        }
    }


    @Nested
    class WhenRegisterNewPayment{

        @Test
        @DisplayName("should add credit card to user")
        void shouldAddCreditCardToUser(){

        }

        @Test
        @DisplayName("should reject credit card when it is invalid")
        void shouldRejectCreditCardWhenItIsInvalid(){

        }

        @Test

        void shouldRjectCreditCardWhenItIsExpired(){

        }

    }

}