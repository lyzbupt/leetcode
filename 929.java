class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null || emails.length == 0) return 0;
        Set<String> set = new HashSet<String>();
        for(String email : emails){
            String[] emailPart = email.split("@");
            String emailLeft = emailPart[0].substring(0, emailPart[0].indexOf("+"));
            emailLeft = emailLeft.replace(".","");
            StringBuilder sb = new StringBuilder();
            sb.append(emailLeft);
            // connect email string
            sb.append("@");
            sb.append(emailPart[1]);
            set.add(sb.toString());
        }
        
        return set.size();    
    }
}
