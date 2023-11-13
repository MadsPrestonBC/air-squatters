package local.airsquatters.TicketSystem;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AccountController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Account>> getAllAccounts() {
	    LOG.info("Getting all accounts.");
	    return new ResponseEntity<List<Account>>(accountService.findAllAccounts(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{cofcId}", method = RequestMethod.GET)
    public ResponseEntity<Account> getAccount(@PathVariable Integer cofcId) {
	    LOG.info("Getting user with ID: {}.", cofcId);
	    return new ResponseEntity<Account>(accountService.findSingleAccount(cofcId), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Account addNewUsers(@RequestBody Account account) {
	    LOG.info("Saving account.");
	    return accountService.createAccount(account);
    }
}
