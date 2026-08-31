// Last updated: 8/31/2026, 9:56:56 AM
class Solution {

    int charLen(int value) {
        int len = 0;
        while(value!=0) {
            len++;
            value /=10;
        }
        return len;
    }

    int checkValidity(String message, int limit, int segments) {
        int charLenSoFar = 0;
        int msgLen = message.length();
        for(int i=1; i<=segments; i++) {
           

            if(charLenSoFar >= msgLen) {
                return -1;
            }
            int formatLen = 3 + charLen(i) + charLen(segments); // "<" + i + "/" + segments + ">"
            int remLen = limit - formatLen;
          
            if(remLen <= 0) {
                return -1;
            }
            charLenSoFar += remLen;
        }
        if(charLenSoFar < msgLen) {
            return 1;
        }

       
        return 0;
    }

    public String[] splitMessage(String message, int limit) {
        int left = 1;
        int right = message.length();
        int segments = Integer.MAX_VALUE;

        while(left <= right) {
            int mid = left + (right-left)/2;

            int segmentValidity = checkValidity(message, limit, mid);
            if(segmentValidity == 0) {
                segments = Math.min(segments, mid);
                right = mid - 1;
                left = 1;
            }
   
            else if(segmentValidity == -1) {
                right = mid - 1;
            }
        
            else {
                left = mid + 1;
            }
        }
      
        if(segments == Integer.MAX_VALUE) {
            return new String[0];
        }
        else {
            
            return getFormattedStrings(message, limit, segments);
        }
    }

    // segments = k
    String[] getFormattedStrings(String message, int limit, int segments) {
        String[] res = new String[segments];
        int msgLen = message.length();
        int charLenSoFar = 0;

        for(int i=1; i<=segments; i++) {
            String format = "<" + i + "/" + segments + ">";
            int remaining = limit - format.length();

            int startIdx = charLenSoFar;
            int endIdx = charLenSoFar + remaining;
            endIdx = Math.min(msgLen, endIdx);

            res[i-1] = message.substring(startIdx, endIdx) + format;
            charLenSoFar += remaining;
        }

        return res;
    }
}