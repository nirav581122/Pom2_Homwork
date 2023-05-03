package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommunityPoleResultPage extends Utils {
    static String expectedVotes = "vot(s)...";
    static String expectedCommunityMessage = "All users can vote.";
    By _actualVoteMassage = By.className("poll-vote-error");
    By _actualVoteTotalMassage = By.className("poll-total-votes");

    public void communityVoteButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String actualVoteMassage = wait.until(ExpectedConditions.visibilityOfElementLocated(_actualVoteMassage)).getText();
        System.out.println("Actual vote Massage::" + actualVoteMassage);
        Assert.assertEquals(actualVoteMassage, expectedCommunityMessage, "Unsuccessful to vote");
    }

    public void communityVoteButtonWithRegistration() {
        String actualVoteTotalMassage = getTextFromElement(_actualVoteTotalMassage);
        System.out.println("Total Votes:" + actualVoteTotalMassage);
        Assert.assertEquals(actualVoteTotalMassage, expectedVotes, "Wrong Vots massage ");
    }
}
