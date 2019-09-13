package id.co.blogspot.diansano.jodemychatapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            /*case 0: RequestsFragment requestsFragment = new RequestsFragment();
            return requestsFragment;*/

            case 0: ChatsFragment chatsFragment = new ChatsFragment();
            return chatsFragment;

            case 1: FriendsFragment friendsFragment = new FriendsFragment();
            return friendsFragment;

            default: return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    public String getPageTitle(int position) {
        switch (position) {
            //case 0: return "REQUESTS";
            case 0: return "CHATS";
            case 1: return "FRIENDS";
            default: return null;
        }
    }
}
