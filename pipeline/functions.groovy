def send_mail() {
    //get mail info
    mailTo = readFile 'MAIL_LIST.txt'
    mailSubject = readFile 'MAIL_SUBJECT.txt'
    mailContent = readFile 'MAIL_CONTENT.txt'
    // send test result

    emailext mimeType: 'text/html', bcc: '', body: mailContent, cc: '', from: 'qinsl0106@thundersoft.com', replyTo: 'qinsl0106@thundersoft.com', subject: mailSubject, to: mailTo
    // don't upload the pdf
    //, attachmentsPattern: '**/*resultfile.pdf'
}

return this
