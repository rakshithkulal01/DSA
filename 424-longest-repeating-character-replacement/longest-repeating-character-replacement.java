class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0;
        int j=0;
        int ans=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            while((i-j+1)-maxfreq>k){
                freq[s.charAt(j) - 'A']--;

                j++;
            }

            ans = Math.max(ans,
                    i-j + 1);
        }

        return ans;
            }
        }
    
